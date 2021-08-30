package br.edu.utfpr.servicebook.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDTO implements Serializable {

    private Long id;

    @NotBlank(message = "Nome inválido! Por favor, insira o nome completo.", groups = UserDTO.RequestUserNameInfoGroupValidation.class)
    @Pattern(regexp = "^(\\s?[A-ZÀ-Ú][a-zà-ú]*)+(\\s[a-zà-ú]*)?(\\s[A-ZÀ-Ú][a-zà-ú]*)+$", message = "Nome inválido! Por favor, insira o nome completo.", groups = UserDTO.RequestUserNameInfoGroupValidation.class)
    private String name;

    @NotBlank(message = "CPF inválido! Por favor, insira o CPF.", groups = UserDTO.RequestUserCPFInfoGroupValidation.class)
    @CPF(message = "CPF inválido! Por favor, insira um CPF válido.", groups = UserDTO.RequestUserCPFInfoGroupValidation.class)
    private String cpf;

    @NotBlank(message = "Email inválido! Por favor, insira o email.", groups = UserDTO.RequestUserEmailInfoGroupValidation.class)
    @Email(message = "Email inválido! Por favor, insira um email válido.", groups = UserDTO.RequestUserEmailInfoGroupValidation.class)
    private String email;

    private String type;
    private String gender;
    private String profilePicture;
    private Date birthDate;

    @NotBlank(message = "Telefone inválido! Por favor, insira o número de telefone.", groups = UserDTO.RequestUserPhoneInfoGroupValidation.class)
    @Pattern(regexp = "^\\(?\\d{2}\\)?\\s?(\\d{4,5})-?(\\d{4})$", message = "Telefone inválido! Por favor, insira um número de telefone válido.", groups = UserDTO.RequestUserPhoneInfoGroupValidation.class)
    private String phoneNumber;

    private boolean phoneVerified;
    private boolean emailVerified;
    private boolean profileVerified;

    private AddressDTO address;

    public interface RequestUserNameInfoGroupValidation {

    }

    public interface RequestUserCPFInfoGroupValidation {

    }

    public interface RequestUserEmailInfoGroupValidation {

    }

    public interface RequestUserPhoneInfoGroupValidation {

    }

}
