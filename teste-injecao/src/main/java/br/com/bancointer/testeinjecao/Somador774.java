package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador774")
public class Somador774 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
