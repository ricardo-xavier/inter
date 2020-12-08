package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador535")
public class Somador535 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
