package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador987")
public class Somador987 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
