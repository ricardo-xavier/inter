package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1151")
public class Somador1151 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
