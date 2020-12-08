package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1753")
public class Somador1753 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
