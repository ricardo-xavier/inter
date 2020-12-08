package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1342")
public class Somador1342 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
