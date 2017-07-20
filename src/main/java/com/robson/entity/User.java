/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robson.entity;

import com.robson.orders.TiposSexo;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author sltnote-6354
 */
@Entity
@Table(name="usuario")
public class User implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_id")
    private int id;
    
    @Column(name="nome")
    @NotNull
    @NotEmpty
    private String nome;
    
    @Column(name="sobrenome")
    @NotNull
    @NotEmpty
    private String sobrenome;
    
    @Column(name="email")
    @NotEmpty
    @NotNull
    private String email;
    
    @Column(name="sexo")
    @Enumerated(EnumType.STRING)
    private TiposSexo sexo;
    
    @Column(name="telefone")
    @NotNull
    @NotEmpty
    private String telefone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TiposSexo getSexo() {
        return sexo;
    }

    public void setSexo(TiposSexo sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    }
