package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador876")
public class Somador876 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
