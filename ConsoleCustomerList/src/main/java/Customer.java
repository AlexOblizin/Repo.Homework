import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer
{
    private String name;
    private String phone;
    private String eMail;


    public String toString()
    {
        return name + " - " + eMail + " - " + phone;
    }
}
