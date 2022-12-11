package com.alaaugusto.contactbook.controller.request;

import com.alaaugusto.contactbook.entity.Contact;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class ContactRequest {
    private String name;
    private String phone;
    private String cep;
    private Integer numero;

    public Contact toEntity(){
        return Contact.builder()
                .name(name)
                .phone(phone)
                .cep(cep.contains("-")? cep.replace("-", ""): cep)
                .numero(numero)
                .build();
    }
}
