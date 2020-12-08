package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1617")
public class Somador1617 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
