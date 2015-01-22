package br.com.csh.web.mb;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

import br.com.csh.model.bean.UsuarioBean;
import br.com.csh.service.UsuarioService;

@Named
@SessionScoped
public class UsuarioMB implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private UsuarioService usuarioService;

	@Produces
	private UsuarioBean usuario;

	public UsuarioBean getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioBean usuario) {
		this.usuario = usuario;
	}

	@Produces
	public UsuarioBean usuarioAutenticado() {
		SecurityContext context = SecurityContextHolder.getContext();
		if (usuario == null) {
			usuario = new UsuarioBean();
		}
		if (context instanceof SecurityContext) {
			Authentication authentication = context.getAuthentication();
			if (authentication instanceof Authentication) {
				if (authentication.isAuthenticated()) {
					if (!authentication.getPrincipal().equals("anonymousUser")) {

						String antigoUsuario = ((User) authentication
								.getPrincipal()).getUsername();
						if (usuario.getUserName() != antigoUsuario) {
							usuario.setUserName(((User) authentication
									.getPrincipal()).getUsername());

							for (Object item : context.getAuthentication()
									.getAuthorities()) {
								usuario.setAutorizacao(item.toString());
							}

						}
					}
				}
			}
		}
		return usuario;
	}

	public void logoof() {
		SecurityContext context = SecurityContextHolder.getContext();
		if (context instanceof SecurityContext) {
			Authentication authentication = context.getAuthentication();
			if (authentication instanceof Authentication) {
				if (authentication.isAuthenticated()) {
					if (!authentication.getPrincipal().equals("anonymousUser")) {
						authentication.setAuthenticated(false);
						usuario = null;
					}
				}
			}

		}
	}

	public void save() {
		usuarioService.save(usuario);
	}

	public void update() {
		if (!usuario.getPassword().equals(""))
			usuarioService.update(usuario);
	}

}
