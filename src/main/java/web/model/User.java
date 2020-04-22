package web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users_db")
public class User implements UserDetails {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "accountNonExpired")
    boolean accountNonExpired = true;
    @Column(name = "accountNonLocked")
    private boolean accountNonLocked = true;
    @Column(name = "credentialsNonExpired")
    private boolean credentialsNonExpired = true;
    @Column(name = "enabled")
    private boolean enabled = true;


    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)

    private Set<Role> authorities;

}

