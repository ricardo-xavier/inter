package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1683")
public class Somador1683 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
