/*
 * package br.com.seuaquario.service;
 * 
 * import java.util.Collection;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.GrantedAuthority; import
 * org.springframework.security.core.userdetails.UserDetails;
 * 
 * import br.com.seuaquario.entity.Usuario;
 * 
 * public class SecUserDetails implements UserDetails {
 * 
 * private static final long serialVersionUID = 1L;
 * 
 * @Autowired Usuario user;
 * 
 * public SecUserDetails(Usuario user) { this.user = user; }
 * 
 * @Override public Collection<? extends GrantedAuthority> getAuthorities() {
 * return null;
 * 
 * }
 * 
 * @Override public String getPassword() { return this.user.getPassword(); }
 * 
 * @Override public String getUsername() { return this.user.getUsername(); }
 * 
 * @Override public boolean isAccountNonExpired() { // TODO Auto-generated
 * method stub return true; }
 * 
 * @Override public boolean isAccountNonLocked() { // TODO Auto-generated method
 * stub return true; }
 * 
 * @Override public boolean isCredentialsNonExpired() { // TODO Auto-generated
 * method stub return true; }
 * 
 * @Override public boolean isEnabled() { // TODO Auto-generated method stub
 * return true; } }
 */