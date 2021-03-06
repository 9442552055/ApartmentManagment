/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author arunmozhi
 */
@Entity
public class LoginModel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LoginModel)) {
            return false;
        }
        LoginModel other = (LoginModel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Account.LoginModel[id=" + id + "]";
    }

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String value) {
        username = value;
    }


    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String value) {
        password = value;
    }
}
