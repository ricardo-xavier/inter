package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador116")
public class Somador116 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
