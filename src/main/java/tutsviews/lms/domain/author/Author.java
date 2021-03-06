package tutsviews.lms.domain.author;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import tutsviews.lms.domain.course.Course;
import tutsviews.lms.domain.media.Image;
import tutsviews.lms.domain.util.AbstractEntity;
import tutsviews.lms.domain.util.Authority;
import tutsviews.lms.domain.util.Plan;
import tutsviews.lms.domain.util.Role;

@Entity
public class Author extends AbstractEntity implements UserDetails  {


	@NotBlank(message="Le Nom est obligatire.")
	private String lastName;

	@NotBlank(message="Le prénom est obligatoire.")
	private String firstName;

	@Lob
	@Column(columnDefinition = "LONGTEXT")
	private String description;

	@Email
	@NotNull
	private String email;

	@NotNull
	private String password;

	@Embedded
	private AuthorAddress address;

	@NotNull
	private String tel;

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "author", fetch=FetchType.LAZY)
	private List<Course> courses;

	@OneToOne(cascade = CascadeType.ALL  , fetch=FetchType.LAZY)
	private Image image;

	@JoinTable(name = "author_role")
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Role> roles;

	private boolean enabled =true;

	@ManyToOne(fetch = FetchType.EAGER)
	private Plan plan;

	public Author() {
		super();
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AuthorAddress getAddress() {
		return address;
	}

	public void setAddress(AuthorAddress address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public Author(String lastName, String firstName, String description, String email, String password, AuthorAddress address,
			String tel, List<Course> courses, Image image) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.description = description;
		this.email = email;
		this.password = password;
		this.address = address;
		this.tel = tel;
		this.courses = courses;
		this.image = image;
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
		roles.forEach(ur -> grantedAuthorities.add(new Authority(ur.getName())));

		return grantedAuthorities;

	}

	@Override
	public String getUsername() {
		return email;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}










}
