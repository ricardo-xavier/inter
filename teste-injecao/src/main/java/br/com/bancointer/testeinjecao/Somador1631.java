package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1631")
public class Somador1631 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
