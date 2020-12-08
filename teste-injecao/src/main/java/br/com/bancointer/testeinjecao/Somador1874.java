package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1874")
public class Somador1874 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
