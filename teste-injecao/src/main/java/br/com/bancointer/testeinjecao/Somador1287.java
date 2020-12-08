package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1287")
public class Somador1287 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
