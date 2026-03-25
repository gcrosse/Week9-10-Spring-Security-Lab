package com.example.Thymeleaf.Demo;

import com.example.Thymeleaf.Demo.Model.Player;
import com.example.Thymeleaf.Demo.repository.PlayerRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

private final PlayerRepository playerRepository;
private final PasswordEncoder passwordEncoder;

public DataLoader(PlayerRepository playerRepository, PasswordEncoder passwordEncoder) {
this.playerRepository = playerRepository;
this.passwordEncoder = passwordEncoder;
}

@Override
public void run(ApplicationArguments args) throws Exception {
String adminEmail = "admin@test.com";

Player existingAdmin = playerRepository.findByEmail(adminEmail);

if (existingAdmin == null) {
Player player = new Player();
player.setName("Admin");
player.setEmail(adminEmail);
player.setPassword(passwordEncoder.encode("admin123"));
player.setRole("ADMIN");

playerRepository.save(player);
}
}
}
