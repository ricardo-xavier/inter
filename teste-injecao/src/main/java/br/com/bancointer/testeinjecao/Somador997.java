package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador997")
public class Somador997 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
