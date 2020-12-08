package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1075")
public class Somador1075 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
