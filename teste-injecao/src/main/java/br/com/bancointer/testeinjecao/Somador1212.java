package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1212")
public class Somador1212 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
