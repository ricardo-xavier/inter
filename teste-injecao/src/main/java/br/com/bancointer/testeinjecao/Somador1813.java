package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1813")
public class Somador1813 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
