package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1423")
public class Somador1423 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
