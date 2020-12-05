package webler.szakdolgozat.honeyAndSalt.entity;

import javax.persistence.*;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@ToString(exclude = {"password", "likedRecipes"})
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;
    
    private String email;

    @Transient
    private String passwordConfirm;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "role_user")
    private List<Role> roles;
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "recipe_user")
    private List<Recipe> likedRecipes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Recipe> getLikedRecipes() {
		if (likedRecipes == null) {
			likedRecipes = new ArrayList<>();
		}
		return likedRecipes;
	}
	public void setLikedRecipes(List<Recipe> likedRecipes) {
		this.likedRecipes = likedRecipes;
	}

	public List<Role> getRoles() {
		if (roles == null){
			roles = new ArrayList<>();
		}
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}


}
