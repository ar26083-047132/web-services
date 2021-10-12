package Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListCompany {

    private Long id;
    private String C_name;
    private String C_country;

    public ListCompany(String c_name, String c_country) {
        C_name = c_name;
        C_country = c_country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getC_name() {
        return C_name;
    }

    public void setC_name(String c_name) {
        C_name = c_name;
    }

    public String getC_country() {
        return C_country;
    }

    public void setC_country(String c_country) {
        C_country = c_country;
    }
}
