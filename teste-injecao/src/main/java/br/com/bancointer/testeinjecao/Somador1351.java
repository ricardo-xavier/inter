package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1351")
public class Somador1351 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
