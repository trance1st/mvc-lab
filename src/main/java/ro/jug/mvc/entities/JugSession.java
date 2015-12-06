package ro.jug.mvc.entities;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

@Entity
@NamedQueries({
        @NamedQuery(name = "getAllSessions", query = "SELECT s FROM JugSession s"),
        @NamedQuery(name = "findSessionsByUser", query = "SELECT s FROM JugSession s WHERE s.byUser = :user")
})
public class JugSession implements Serializable {

    private static final long serialVersionUID = -8061042352342915142L;

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Version
	private int version;

	@Column
    @Size(min = 8, max = 100)
	private String title;

	@Column(length = 3000)
    @Lob
	private String description;

	@ManyToOne
	private User byUser;

    public JugSession() {
    }

    public JugSession(String title, String description, User byUser) {
        this.title = title;
        this.description = description;
        this.byUser = byUser;
    }

    public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(final int version) {
		this.version = version;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

    public User getByUser() {
        return this.byUser;
    }

    public void setByUser(final User byUser) {
        this.byUser = byUser;
    }

    @Override
    public String toString() {
        return "JugSession{" +
                "byUser=" + byUser +
                ", description='" + description + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JugSession that = (JugSession) o;
        return Objects.equals(title, that.title) &&
                Objects.equals(description, that.description) &&
                Objects.equals(byUser, that.byUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, byUser);
    }

}