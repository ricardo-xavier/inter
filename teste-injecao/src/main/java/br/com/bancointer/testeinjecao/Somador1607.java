package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1607")
public class Somador1607 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
