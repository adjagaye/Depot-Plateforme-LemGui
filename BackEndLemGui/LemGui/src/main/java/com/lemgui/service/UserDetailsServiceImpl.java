package com.lemgui.service;

import com.lemgui.entities.Membre;
import com.lemgui.entities.Profil;
import jdk.internal.org.objectweb.asm.Handle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private MembreRepository membreRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    public UserDetailsServiceImpl(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        System.out.println(login+"****************");
        Membre membre =  membreRepository.findMembreByLogin(login);
        System.out.println(membre.getMdp()+"****************");
        if (membre == null){
            throw new UsernameNotFoundException(login);
        }
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        membre.getProfils().forEach(profil -> authorities.add(new SimpleGrantedAuthority(profil.getLibelleProfil())));
        for (Profil p : membre.getProfils()) {
            System.out.println(p.getLibelleProfil());
        }
        String hashPW = bCryptPasswordEncoder.encode(membre.getMdp());
        membre.setMdp(hashPW);
        return new User(membre.getLogin(),membre.getMdp(),authorities );


    }
}
