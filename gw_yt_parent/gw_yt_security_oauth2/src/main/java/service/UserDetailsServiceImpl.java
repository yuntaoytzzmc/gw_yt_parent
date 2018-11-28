package service;

import com.google.common.collect.Sets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * Created by Gimgoog on 2017/11/17.
 */
@Component
public class UserDetailsServiceImpl implements UserDetailsService {
    private Logger lo  = LoggerFactory.getLogger(getClass());
    @Autowired
    private  PasswordEncoder passwordEncoder;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Collection<GrantedAuthority> authSet = Sets.newHashSet();
        authSet.add(new SimpleGrantedAuthority("ROLE_CLIENT "));
        boolean accountNonExpired = true;
        boolean credentialsNonExpired = true;
        User userdetail = new User("yt", passwordEncoder.encode("123456"), true, accountNonExpired, credentialsNonExpired, true, authSet);
        return userdetail;
    }
}
