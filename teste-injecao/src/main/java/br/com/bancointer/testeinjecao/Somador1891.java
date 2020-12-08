package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1891")
public class Somador1891 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
