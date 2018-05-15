package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "TABLES", schema = "information_schema", catalog = "")
public class TablesEntity {
    private Long autoIncrement;

    @Basic
    @Column(name = "AUTO_INCREMENT")
    public Long getAutoIncrement() {
        return autoIncrement;
    }

    public void setAutoIncrement(Long autoIncrement) {
        this.autoIncrement = autoIncrement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TablesEntity that = (TablesEntity) o;
        return Objects.equals(autoIncrement, that.autoIncrement);
    }

    @Override
    public int hashCode() {

        return Objects.hash(autoIncrement);
    }
}
