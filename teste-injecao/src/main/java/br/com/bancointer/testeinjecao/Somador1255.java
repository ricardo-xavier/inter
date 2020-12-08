package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1255")
public class Somador1255 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
