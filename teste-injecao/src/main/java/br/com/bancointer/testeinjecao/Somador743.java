package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador743")
public class Somador743 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
