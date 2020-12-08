package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador875")
public class Somador875 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
