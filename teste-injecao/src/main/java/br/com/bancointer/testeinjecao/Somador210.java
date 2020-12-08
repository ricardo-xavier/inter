package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador210")
public class Somador210 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
