package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1085")
public class Somador1085 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
