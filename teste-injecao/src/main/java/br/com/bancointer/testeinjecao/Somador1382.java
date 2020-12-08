package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1382")
public class Somador1382 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
