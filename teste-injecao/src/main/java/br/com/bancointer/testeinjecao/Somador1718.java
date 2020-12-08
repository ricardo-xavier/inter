package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1718")
public class Somador1718 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
