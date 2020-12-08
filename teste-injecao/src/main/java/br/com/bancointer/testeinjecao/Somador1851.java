package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1851")
public class Somador1851 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
