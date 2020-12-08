package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1803")
public class Somador1803 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
