package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1639")
public class Somador1639 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
