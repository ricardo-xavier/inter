package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1786")
public class Somador1786 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
