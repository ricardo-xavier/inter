package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1726")
public class Somador1726 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
