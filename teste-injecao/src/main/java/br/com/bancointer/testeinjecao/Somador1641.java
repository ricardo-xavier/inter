package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1641")
public class Somador1641 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
