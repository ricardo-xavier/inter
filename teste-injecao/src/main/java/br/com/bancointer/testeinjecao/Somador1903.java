package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1903")
public class Somador1903 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
