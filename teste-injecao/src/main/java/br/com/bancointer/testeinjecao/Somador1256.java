package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1256")
public class Somador1256 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
