package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1031")
public class Somador1031 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
