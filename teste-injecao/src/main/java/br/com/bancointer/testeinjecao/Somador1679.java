package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1679")
public class Somador1679 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
